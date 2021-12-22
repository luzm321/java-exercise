//package JavaTestAutomation;
//
//// import necessary libraries and dependencies:
//// Assert in JUnit tool for testing:
//public class SearchTests extends BaseTests {
//
//    @Test
//    public void testSearchForDiscountedProduct() {
//        String productName = "Apple TV";
//        SearchResults searchResults = homePage.search(productName);
//        Assert.assertTrue(productName + " is in search results", searchResults.isProductListed(productName));
//        Assert.assertEquals(productName + " original price", "$80.00", searchResults.getOriginalPrice(productName));
//        Assert.assertEquals(productName + " current price", "$70.00", searchResults.getProductPrice(productName));
//        Assert.assertEquals("Number of search results", 1, searchResults.getNumberOfListedProducts());
//    }
//}
