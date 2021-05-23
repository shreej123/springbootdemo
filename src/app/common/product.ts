//export class Product {

   //id: number;
    // sku: string;
    // name: string;
    // description: string;
   //  unit_price: number;
  // image_url: string;
   //  //active: boolean;
     //units_in_stock: number;
   //  date_created: Date;
     //last_updated: Date;
     //category_id:number;
//}


export interface Product {
    id: string;
    sku: string;
    name: string ;
    description: string;
    unitPrice: any;
    imageUrl: string;
    active: boolean;
    unitsInStock: number;
    dateCreated: Date;
    lastUpdate: Date;
}