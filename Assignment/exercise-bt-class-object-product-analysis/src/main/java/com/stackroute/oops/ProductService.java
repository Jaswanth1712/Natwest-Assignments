package com.stackroute.oops;


import static com.stackroute.oops.ProductRepository.getProducts;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {

Product[] products=getProducts();
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {


        for(Product pc:products){
            if(pc.getProductCode()==productCode){
                return pc.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        double maxi=0;
        Product ans=null;

        for(Product pc:products){
            if(pc.getCategory().equals(category) && pc.getPrice()>maxi){
                maxi=pc.getPrice();
              ans=pc;


            }
        }



        return ans;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {

        int count=0;
        Product[] ans=null;
        for(Product pc:products){
            if(pc.getCategory().equals(category)){
                count++;
            }
        }
     if(count==0) {
         return ans;
     }
        ans=new Product[count];

        int ind=0;
        for(Product pc:products){
            if(pc.getCategory().equals(category)){
                ans[ind]=pc;
                ind++;
            }
        }
    return ans;

    }
}
