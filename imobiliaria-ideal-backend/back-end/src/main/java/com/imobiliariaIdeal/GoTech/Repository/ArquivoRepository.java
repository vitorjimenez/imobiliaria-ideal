package com.imobiliariaIdeal.GoTech.Repository;

import com.imobiliariaIdeal.GoTech.Class.Arquivo;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {
}
