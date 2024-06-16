package net.mcreator.prehistoricuprising.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.prehistoricuprising.entity.ParasaurolophusEntity;

public class ParasaurolophusModel extends GeoModel<ParasaurolophusEntity> {
	@Override
	public ResourceLocation getAnimationResource(ParasaurolophusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "animations/parasaurolophus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ParasaurolophusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "geo/parasaurolophus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ParasaurolophusEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ParasaurolophusEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Neck");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
