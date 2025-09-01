package FileSystemWithComposite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("Comedy_Movies");
        File hulchal = new File("Hulchal");
        comedyMovieDirectory.add(hulchal);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
