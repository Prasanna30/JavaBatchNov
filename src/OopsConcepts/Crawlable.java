package OopsConcepts;

public interface Crawlable {
	default void crawl(){
        System.out.println("I am crawling !!");
    }
}
