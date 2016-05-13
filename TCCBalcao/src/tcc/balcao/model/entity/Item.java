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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Item generated by hbm2java
 */
@Entity
@Table(name = "item", schema = "public")
public class Item implements java.io.Serializable {

	private Integer iditem;
	private Tipoitem tipoitem;
	private String nome;
	private String descricao;
	private double valor;
	private String img;
	private byte[] imgs;
	private Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);
	private Set<Historicopedidos> historicopedidoses = new HashSet<Historicopedidos>(
			0);

	public Item() {
	}

	public Item(Tipoitem tipoitem, String nome, double valor, String img) {
		this.tipoitem = tipoitem;
		this.nome = nome;
		this.valor = valor;
		this.img = img;
	}

	public Item(Tipoitem tipoitem, String nome, String descricao, double valor,
			String img, byte[] imgs, Set<Pedidos> pedidoses,
			Set<Historicopedidos> historicopedidoses) {
		this.tipoitem = tipoitem;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.img = img;
		this.imgs = imgs;
		this.pedidoses = pedidoses;
		this.historicopedidoses = historicopedidoses;
	}

	@SequenceGenerator(name = "generator", allocationSize=1, sequenceName = "public.item_seq")
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "generator")
	@Column(name = "iditem", unique = true, nullable = false)
	public Integer getIditem() {
		return this.iditem;
	}

	public void setIditem(Integer iditem) {
		this.iditem = iditem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipo_item", nullable = false)
	public Tipoitem getTipoitem() {
		return this.tipoitem;
	}

	public void setTipoitem(Tipoitem tipoitem) {
		this.tipoitem = tipoitem;
	}

	@Column(name = "nome", nullable = false, length = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "descricao", length = 8000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "valor", nullable = false, precision = 17, scale = 17)
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Column(name = "img", nullable = false, length = 200)
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "imgs")
	public byte[] getImgs() {
		return this.imgs;
	}

	public void setImgs(byte[] imgs) {
		this.imgs = imgs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<Pedidos> getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(Set<Pedidos> pedidoses) {
		this.pedidoses = pedidoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<Historicopedidos> getHistoricopedidoses() {
		return this.historicopedidoses;
	}

	public void setHistoricopedidoses(Set<Historicopedidos> historicopedidoses) {
		this.historicopedidoses = historicopedidoses;
	}

}