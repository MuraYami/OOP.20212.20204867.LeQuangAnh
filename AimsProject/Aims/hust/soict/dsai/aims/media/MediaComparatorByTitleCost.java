package hust.soict.dsai.aims.media;
import java.util.Comparator;

public abstract class MediaComparatorByTitleCost implements Comparator<Media> {
	public MediaComparatorByTitleCost() {
	Comparator.comparing(Media::getTitle).thenComparing(Media::getCost);
	}
}