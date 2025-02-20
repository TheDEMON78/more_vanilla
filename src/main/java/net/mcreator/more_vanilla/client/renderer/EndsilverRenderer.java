
package net.mcreator.more_vanilla.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.more_vanilla.entity.EndsilverEntity;

public class EndsilverRenderer extends MobRenderer<EndsilverEntity, SilverfishModel<EndsilverEntity>> {
	public EndsilverRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel<EndsilverEntity>(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndsilverEntity entity) {
		return ResourceLocation.parse("more_vanilla:textures/entities/endsilver.png");
	}
}
