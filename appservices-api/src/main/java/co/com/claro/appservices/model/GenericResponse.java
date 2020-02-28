package co.com.claro.appservices.model;

public class GenericResponse<T> extends BaseResponse {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
