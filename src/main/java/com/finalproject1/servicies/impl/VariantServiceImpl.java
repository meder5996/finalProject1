package com.finalproject1.servicies.impl;

import com.finalproject1.entities.Variant;
import com.finalproject1.repositories.VariantRepository;
import com.finalproject1.servicies.VariantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class VariantServiceImpl implements VariantService {

    private final VariantRepository variantRepository;

    @Override
    public List<Variant> findAllVariant() {
        return variantRepository.findAll();
    }

    @Override
    public Variant saveVariant(Variant variant) {
        return variantRepository.save(variant);
    }

    @Override
    public Optional<Variant> findByIdVariant(Long id) {
        return variantRepository.findById(id);
    }

    @Override
    public void deleteByIdVariant(Long id) {
        variantRepository.deleteById(id);
    }
}
