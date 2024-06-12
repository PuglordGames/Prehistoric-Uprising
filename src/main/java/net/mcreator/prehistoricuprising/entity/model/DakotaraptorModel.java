package net.mcreator.prehistoricuprising.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.prehistoricuprising.entity.DakotaraptorEntity;

public class DakotaraptorModel extends GeoModel<DakotaraptorEntity> {
	@Override
	public ResourceLocation getAnimationResource(DakotaraptorEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "animations/dakotaraptor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DakotaraptorEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "geo/dakotaraptor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DakotaraptorEntity entity) {
		return new ResourceLocation("prehistoric_uprising", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(DakotaraptorEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Neck");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
