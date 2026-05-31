package com.hotelhub.service;

import com.hotelhub.dto.hotel.*;

import java.util.List;

public interface IHotelService {

    HotelResponse create(CreateHotelRequest request);

    HotelResponse getById(Long id);

    List<HotelResponse> getAll();

    HotelResponse update(Long id, UpdateHotelRequest request);

    void delete(Long id);
}