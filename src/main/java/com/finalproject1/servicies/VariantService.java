package com.finalproject1.servicies;

import com.finalproject1.entities.Variant;

import java.util.List;
import java.util.Optional;

public interface VariantService {

    List<Variant> findAllVariant();

    Variant saveVariant(Variant variant);

    Optional<Variant> findByIdVariant(Long id);

    void deleteByIdVariant(Long id);
}
