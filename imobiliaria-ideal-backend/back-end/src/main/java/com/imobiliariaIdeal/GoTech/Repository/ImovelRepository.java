package com.imobiliariaIdeal.GoTech.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.imobiliariaIdeal.GoTech.Class.Imovel;

import java.util.Optional;

@Repository
public interface ImovelRepository extends CrudRepository <Imovel, Long> {

    @Override
    Optional<Imovel> findById(Long aLong);
}
