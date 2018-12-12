package com.cm.cmdc.sequence.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.cm.cmdc.sequence.DistributeSequenceService;

@Service
public class DistributeSequenceServiceImpl implements DistributeSequenceService {

	@Override
	public long getSequence() {

		return UUID.randomUUID().timestamp();
	}

}
