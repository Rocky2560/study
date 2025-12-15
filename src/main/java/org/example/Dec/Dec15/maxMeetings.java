package org.example.Dec.Dec15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class maxMeetings implements Comparator<maxMeetings> {

    int startTime, endTime, pos;

    maxMeetings(int startTime, int endTime, int pos) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.pos = pos;
    }

    public static void main(String[] args) {
            int[] start = {1, 3, 0, 5, 8, 5};
            int[] end = {2, 4, 6, 7, 9, 9};
            
            List<Integer> a = maxMeetingGreedyApproach(start, end);
            System.out.print(a);
    }
    
    public static List<Integer> maxMeetingGreedyApproach(int[] start, int[] end)
    {
        List<Integer> res = new ArrayList<>();
        int n = start.length;
        List<maxMeetings> meet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meet.add(new maxMeetings(start[i],end[i],i+1));
        }

        meet.sort(new MeetingComparator());

        int currtime = -1;
        for (maxMeetings maxMeetings: meet)
        {
            if (maxMeetings.startTime > currtime)
            {
                currtime = maxMeetings.endTime;
                res.add(maxMeetings.pos);
            }
        }

        res.sort(Integer::compareTo);
        return res;
    }


    @Override
    public int compare(maxMeetings o1, maxMeetings o2) {
        return Integer.compare(o1.endTime, o2.endTime);
    }

}
class MeetingComparator implements Comparator<maxMeetings> {

    @Override
    public int compare(maxMeetings o1, maxMeetings o2) {
        return Integer.compare(o1.endTime, o2.endTime);
    }
}

