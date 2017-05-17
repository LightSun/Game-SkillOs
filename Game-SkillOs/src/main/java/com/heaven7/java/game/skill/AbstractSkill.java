package com.heaven7.java.game.skill;

import java.util.List;

/**
 * 持续时间， 释放时间， 显示的时间（每帧）-->决定绘制
 * buff, debuff 叠加？
 * ps: 押镖 & 抢劫 ?
 * @author heaven7
 *
 */
public class AbstractSkill<E> {

	private long duration;
	private long fireDuration;
	private long startTime;
	
	//技能阶段/状态？
	public void update(float deltaTime){
		
	}
	
	public void render(float deltaTime, List<IGameObject> list){//目标坐标，敌人坐标?
		//确定位置
	}
}
