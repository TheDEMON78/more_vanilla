
package net.mcreator.more_vanilla.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.more_vanilla.entity.BossofenderiteEntity;

public class BossofenderiteRenderer extends HumanoidMobRenderer<BossofenderiteEntity, HumanoidModel<BossofenderiteEntity>> {
	public BossofenderiteRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<BossofenderiteEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(BossofenderiteEntity entity) {
		return ResourceLocation.parse("more_vanilla:textures/entities/enderite_block.png");
	}
}
