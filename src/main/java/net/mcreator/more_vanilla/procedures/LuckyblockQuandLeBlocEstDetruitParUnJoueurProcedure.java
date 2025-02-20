package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.more_vanilla.init.MoreVanillaModItems;
import net.mcreator.more_vanilla.init.MoreVanillaModEntities;
import net.mcreator.more_vanilla.init.MoreVanillaModBlocks;

public class LuckyblockQuandLeBlocEstDetruitParUnJoueurProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double c = 0;
		if (entity instanceof ServerPlayer _player) {
			AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("more_vanilla:bigluckorbignoluck"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.5) {
										if (Math.random() < 0.5) {
											if (Math.random() < 0.5) {
												if (Math.random() < 0.5) {
													if (Math.random() < 0.5) {
														if (Math.random() < 0.5) {
															if (Math.random() < 0.5) {
																world.setBlock(BlockPos.containing(x + 1, y, z), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x, y, z + 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x + 1, y, z + 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x + 1, y, z - 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x - 1, y, z + 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x - 1, y, z), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x, y, z - 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x - 1, y, z - 1), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
																world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.LUCKYBLOCK.get().defaultBlockState(), 3);
															} else {
																world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.ENDERITEBLOCK.get().defaultBlockState(), 3);
															}
														} else {
															if (world instanceof ServerLevel _level) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
																entityToSpawn.setPickUpDelay(10);
																entityToSpawn.setUnlimitedLifetime();
																_level.addFreshEntity(entityToSpawn);
															}
														}
													} else {
														if (world instanceof ServerLevel _level) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModBlocks.CAVEBLOCK.get()));
															entityToSpawn.setPickUpDelay(10);
															entityToSpawn.setUnlimitedLifetime();
															_level.addFreshEntity(entityToSpawn);
														}
													}
												} else {
													if (world instanceof ServerLevel _level) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_APPLE));
														entityToSpawn.setPickUpDelay(10);
														entityToSpawn.setUnlimitedLifetime();
														_level.addFreshEntity(entityToSpawn);
													}
												}
											} else {
												if (world instanceof ServerLevel _level) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ELYTRA));
													entityToSpawn.setPickUpDelay(10);
													entityToSpawn.setUnlimitedLifetime();
													_level.addFreshEntity(entityToSpawn);
												}
											}
										} else {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("more_vanilla", "luckyblockenderite"));
												if (template != null) {
													template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
										}
									} else {
										c = Math.ceil(Math.random() * 10);
										if (c <= 3.3) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELENDERITE.get()));
												entityToSpawn.setPickUpDelay(10);
												entityToSpawn.setUnlimitedLifetime();
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (c >= 3.4 && c <= 6.7) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITEHAMMER.get()));
												entityToSpawn.setPickUpDelay(10);
												entityToSpawn.setUnlimitedLifetime();
												_level.addFreshEntity(entityToSpawn);
											}
										} else if (c >= 6.8) {
											if (world instanceof ServerLevel _level) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_EXAVATOR.get()));
												entityToSpawn.setPickUpDelay(10);
												entityToSpawn.setUnlimitedLifetime();
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								} else {
									c = Math.ceil(Math.random() * 10);
									if (c <= 2) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_SWORD.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 2.1 && c <= 4) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_PICKAXE.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 4.1 && c <= 6) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_AXE.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 6.1 && c <= 8) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_SHOVEL.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 8.1) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_HOE.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							} else {
								c = Math.ceil(Math.random() * 10);
								if (c <= 2.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_ARMOR_HELMET.get()));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 2.6 && c <= 5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_ARMOR_CHESTPLATE.get()));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 5.1 && c <= 7.5) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_ARMOR_LEGGINGS.get()));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 7.6) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITE_ARMOR_BOOTS.get()));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITEINGOT.get()));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ENDERITESCRAP.get()));
							entityToSpawn.setPickUpDelay(10);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ENDER_PEARL));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHERITE_BLOCK.defaultBlockState(), 3);
			}
		} else {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = MoreVanillaModEntities.BOSSOFENDERITEPHASE1.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.WITHER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.RAVAGER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						}
					} else {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.LAVA.defaultBlockState(), 3);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 1, y, z)));;
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z + 1)));;
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 1, y, z)));;
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z - 1)));;
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
