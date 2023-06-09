export const getFeature = async (id) => {
  //FEATURE
  const urlFeature = `http://ec2-18-222-230-254.us-east-2.compute.amazonaws.com:8080/feature/${id}`;

  const resp = await fetch(url);
  const { data } = await resp.json();

  const feature = data.map((ftr) => ({
    id: ftr.id,
    title: ftr.title,
    url: ftr.images.downsized_medium.url,
  }));
  // console.log(feature);
  return feature;
};
