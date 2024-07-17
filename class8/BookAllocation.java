// https://www.geeksforgeeks.org/allocate-minimum-number-pages/
public class BookAllocation {

    public static void main(String[] args) {
        int N = 4;
        int M = 2;
        int[] pages = {12, 34, 67, 90};
        int ans = bookAllocation(N, M, pages);
        System.out.println(ans);
    }

    static int bookAllocation(int N, int M, int[] pages) {
        int totalPages = 0;
        int maxPages = 0;

        for (int page : pages) {
            totalPages += page;
            if (page > maxPages) {
                maxPages = page;
            }
        }

        int start = maxPages;  // minimum possible maximum pages
        int end = totalPages;  // maximum possible maximum pages
        int result = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isFeasible(pages, N, M, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    static boolean isFeasible(int[] pages, int N, int M, int maxPagesPerStudent) {
        int studentCount = 1;
        int pagesAllocated = 0;

        for (int page : pages) {
            if (pagesAllocated + page > maxPagesPerStudent) {
                studentCount++;
                pagesAllocated = page;
                if (studentCount > M) {
                    return false;
                }
            } else {
                pagesAllocated += page;
            }
        }

        return true;
    }
}
