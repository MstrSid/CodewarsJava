package pagination_helper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PaginationHelper<Character> paginationHelper =
                new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(paginationHelper.itemCount());
        System.out.println(paginationHelper.pageCount());
        System.out.println(paginationHelper.pageItemCount(2));
        System.out.println(paginationHelper.pageIndex(9));
    }
}
