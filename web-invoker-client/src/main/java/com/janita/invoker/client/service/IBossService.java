package com.janita.invoker.client.service;

import com.janita.invoker.client.bean.Boss;

/**
 * Created by Janita on 2017-03-24 12:08
 */
public interface IBossService {
    Boss getBossById(Long bossId,Long carId);
}
