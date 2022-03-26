import org.junit.Test;

public class FetchData {

    String sheetURL = "https://docs.google.com/spreadsheets/d/1rGhZhL3LvvRRb4Nijyn2qtwRQvOwLVd6MnyB5Q1j6OQ";


    @Test
    public void getMeDataFromGSheet(){
        String value = HttpHelper.makeGETRequest(sheetURL+"?tqx=out:csv");
        System.out.println(value);
    }

    @Test
    public void getMeSpecificDataFromGSheetInKeyValuePain(){
        String value = GetSpecificFromSheet.fetchTestDataFor("Name",sheetURL+"/gviz/tq?tqx=out:csv");
        System.out.println(value);
    }

}
