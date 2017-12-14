package managedbean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Util {
	private String dataSistema;
	private String versaoSistema;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Util() {
		dataSistema = sdf.format(new Date());
		versaoSistema = "v0.0.1-beta";
	}
	
	public String getDataSistema() {
		return dataSistema;
	}
	public void setDataSistema(String dataSistema) {
		this.dataSistema = dataSistema;
	}
	public String getVersaoSistema() {
		return versaoSistema;
	}
	public void setVersaoSistema(String versaoSistema) {
		this.versaoSistema = versaoSistema;
	}
	
	public String formataData(String d) {
		return sdf.format(d);
	}
	
}
