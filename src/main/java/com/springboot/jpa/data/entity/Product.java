package com.springboot.jpa.data.entity;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity //클래스가 엔티티임을 명시하는 어노테이션
@Table(name = "product") //특별한 경우 쓰지 않지만 DB의 테이블 명을 클래스명과 달리할때 명시, 자주 쓰임(자바와 DB의 명명법이 달라서)
public class Product {

    /**
     * PK
     * 상품 번호
     *
     * @Id : 테이블의 PK로 생성
     * @GeneratedValue : @Id와 세트, 해당 필드의 값을 어떤 방식으로 자동 생성할지 결정
     * @Column : 별 다른 설정이 없으면 엔티티의 필드는 자동을 테이블 컬럼으로 매핑되지만 다른 설정이 필요할때 본 어노테이션 사용
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // == 데이터베이스의 AUTO_INCREMENT
    private Long number;

    //상품이름
    @Column(nullable = false)
    private String name;

    //상품가격
    @Column(nullable = false)
    private Integer price;

    //상품재고
    @Column(nullable = false)
    private Integer stock;

    //상품 생성 일자
    private LocalDateTime createAt;

    //상품 정보 변경 일자
    private LocalDateTime updateAt;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
