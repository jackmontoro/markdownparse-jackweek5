import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void testDefaultLinkMethod() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testOneLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-new-test.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTwoLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-test-two.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testThreeLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-test-three.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }
}