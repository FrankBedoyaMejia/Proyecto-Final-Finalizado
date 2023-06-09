export const getProduct = async (id) => {
  const urlProduct = `http://ec2-18-222-230-254.us-east-2.compute.amazonaws.com:8080/product/${id}`;

  const resp = await fetch(urlProduct);
  const { data } = await resp.json();

  const product = data.map((prd) => ({
    id: prd.id,
    title: prd.title,
    url: prd.images.downsized_medium.url,
  }));
  // console.log(products);
  return product;
};
