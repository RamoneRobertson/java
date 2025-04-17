
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCount = {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCount;
    }

    public int getToday() {
        int[] weeklyCount = getLastWeek();
        int lastDay = weeklyCount.length - 1;
        return weeklyCount[lastDay];
    }

    public void incrementTodaysCount() {
        int[] week = getLastWeek();
        week[getToday()] = week[getToday()] + 1;
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
