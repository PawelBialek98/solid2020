package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer implements Printable {
    /**
     * Prints the current page.
     */
    @Override
    public void printCurrentPage(Book book){
        System.out.println(book.getCurrentPageContents());
    }
    /**
     * Prints all pages
     * @return
     */
    @Override
    public String printAllPages(Book book) {
        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getAllPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
