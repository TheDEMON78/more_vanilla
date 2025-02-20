
package net.mcreator.more_vanilla.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.more_vanilla.entity.UpgradegoldbossEntity;

public class UpgradegoldbossRenderer extends HumanoidMobRenderer<UpgradegoldbossEntity, HumanoidModel<UpgradegoldbossEntity>> {
	public UpgradegoldbossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<UpgradegoldbossEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(UpgradegoldbossEntity entity) {
		return ResourceLocation.parse("more_vanilla:textures/entities/netherite_gold_block.png");
	}
}
