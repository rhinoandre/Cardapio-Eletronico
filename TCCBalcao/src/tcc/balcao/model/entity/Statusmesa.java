package tcc.balcao.model.entity;

// Generated 22/10/2011 15:14:54 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Statusmesa generated by hbm2java
 */
@Entity
@Table(name = "statusmesa", schema = "public")
public class Statusmesa implements java.io.Serializable {

	private Integer idstatusMesa;
	private String status;
	private String imgs;
	private Set<Mesa> mesas = new HashSet<Mesa>(0);

	public Statusmesa() {
	}

	public Statusmesa(String status) {
		this.status = status;
	}

	public Statusmesa(String status, String imgs, Set<Mesa> mesas) {
		this.status = status;
		this.imgs = imgs;
		this.mesas = mesas;
	}

	@SequenceGenerator(name = "generator", allocationSize=1, sequenceName = "public.status_mesa_seq")
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "generator")
	@Column(name = "idstatus_mesa", unique = true, nullable = false)
	public Integer getIdstatusMesa() {
		return this.idstatusMesa;
	}

	public void setIdstatusMesa(Integer idstatusMesa) {
		this.idstatusMesa = idstatusMesa;
	}

	@Column(name = "status", nullable = false, length = 60)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "imgs")
	public String getImgs() {
		return this.imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusmesa")
	public Set<Mesa> getMesas() {
		return this.mesas;
	}

	public void setMesas(Set<Mesa> mesas) {
		this.mesas = mesas;
	}

}
