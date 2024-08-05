package net.mcreator.prehistoricuprising.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.prehistoricuprising.entity.EdmontosaurusEntity;

public class EdmontosaurusModel extends GeoModel<EdmontosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(EdmontosaurusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "animations/edmontosaurus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EdmontosaurusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "geo/edmontosaurus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EdmontosaurusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(EdmontosaurusEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("neck");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
