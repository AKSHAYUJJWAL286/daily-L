class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];

            }else{
                break;
            }
        }

    HashSet<Integer> seq = new HashSet<>();
    for(int num:nums){
        seq.add(num);
    }

    while(seq.contains(sum)){
        sum++;
    }
    return sum;
            }
    }