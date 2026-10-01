class Solution(object):
    def countTestedDevices(self, batteryPercentages):
        """
        :type batteryPercentages: List[int]
        :rtype: int
        """
        k=0;
        for a in batteryPercentages:
            k+=a>k;
        return k;