import { useContext } from "react";
import { Link } from "react-router-dom";
import { ContextGlobal } from "../utilities/globalContext";
import { Rating } from "./Rating";

export const Card = (props) => {
  const { product } = props;
  const { handlerHide } = useContext(ContextGlobal);
  return (
    <div className="card">
      <div
        key={"card--imgs"}
        className="card-img"
        style={{
          backgroundImage: `url(${
            product?.image?.filter((productos) =>
              productos.title?.includes("Main")
            )[0]?.url
          })`,
        }}
      >
        {/* <div className="card-information__rating">
          <Rating />
        </div> */}
        <div className="card-information__rating">
          <Rating avgRating={product?.productAverage} productID={product.id} />
        </div>
      </div>
      <div className="card-information" key={"card--information--container"}>
        <h4>{product?.category?.title}</h4>
        <p>{product?.productName}</p>
        <p>{product?.model}</p>
        <p>{product?.city?.nameCity}</p>
        <Link to={`/product/detail/${product.id}`} onClick={handlerHide}>
          <button className="button__hide button__card">Details</button>
        </Link>
      </div>
    </div>
  );
};
