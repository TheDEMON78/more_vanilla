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

public class NetheriteLuckyblockQuandLeBlocEstDetruitParUnJoueurProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double c = 0;
		if (entity instanceof ServerPlayer _player) {
			AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("more_vanilla:luckornoluck"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (Math.random() < 0.7) {
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
																											world.setBlock(BlockPos.containing(x + 1, y, z), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x, y, z + 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x + 1, y, z + 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x + 1, y, z - 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x - 1, y, z + 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x - 1, y, z), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x, y, z - 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x - 1, y, z - 1), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																											world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.NETHERITE_LUCKYBLOCK.get().defaultBlockState(), 3);
																										} else {
																											world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.ENDERITEBLOCK.get().defaultBlockState(), 3);
																										}
																									} else {
																										if (world instanceof ServerLevel _level) {
																											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModBlocks.LUCKYBLOCK.get()));
																											entityToSpawn.setPickUpDelay(10);
																											entityToSpawn.setUnlimitedLifetime();
																											_level.addFreshEntity(entityToSpawn);
																										}
																									}
																								} else {
																									c = Math.ceil(Math.random() * 10);
																									if (c <= 3.3) {
																										if (world instanceof ServerLevel _level) {
																											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELUPGRADEDIAMONDNETHERITE.get()));
																											entityToSpawn.setPickUpDelay(10);
																											entityToSpawn.setUnlimitedLifetime();
																											_level.addFreshEntity(entityToSpawn);
																										}
																									} else if (c >= 3.4 && c <= 6.7) {
																										if (world instanceof ServerLevel _level) {
																											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEDIAMONDNETHERITEHAMMER.get()));
																											entityToSpawn.setPickUpDelay(10);
																											entityToSpawn.setUnlimitedLifetime();
																											_level.addFreshEntity(entityToSpawn);
																										}
																									} else if (c >= 6.8) {
																										if (world instanceof ServerLevel _level) {
																											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEDIAMONDNETHERITEEXAVATOR.get()));
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
																										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDSWORD.get()));
																										entityToSpawn.setPickUpDelay(10);
																										entityToSpawn.setUnlimitedLifetime();
																										_level.addFreshEntity(entityToSpawn);
																									}
																								} else if (c >= 2.1 && c <= 4) {
																									if (world instanceof ServerLevel _level) {
																										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDPICKAXE.get()));
																										entityToSpawn.setPickUpDelay(10);
																										entityToSpawn.setUnlimitedLifetime();
																										_level.addFreshEntity(entityToSpawn);
																									}
																								} else if (c >= 4.1 && c <= 6) {
																									if (world instanceof ServerLevel _level) {
																										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDAXE.get()));
																										entityToSpawn.setPickUpDelay(10);
																										entityToSpawn.setUnlimitedLifetime();
																										_level.addFreshEntity(entityToSpawn);
																									}
																								} else if (c >= 6.1 && c <= 8) {
																									if (world instanceof ServerLevel _level) {
																										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDSHOVEL.get()));
																										entityToSpawn.setPickUpDelay(10);
																										entityToSpawn.setUnlimitedLifetime();
																										_level.addFreshEntity(entityToSpawn);
																									}
																								} else if (c >= 8.1) {
																									if (world instanceof ServerLevel _level) {
																										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDHOE.get()));
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
																									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMOND_HELMET.get()));
																									entityToSpawn.setPickUpDelay(10);
																									entityToSpawn.setUnlimitedLifetime();
																									_level.addFreshEntity(entityToSpawn);
																								}
																							} else if (c >= 2.6 && c <= 5) {
																								if (world instanceof ServerLevel _level) {
																									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMOND_CHESTPLATE.get()));
																									entityToSpawn.setPickUpDelay(10);
																									entityToSpawn.setUnlimitedLifetime();
																									_level.addFreshEntity(entityToSpawn);
																								}
																							} else if (c >= 5.1 && c <= 7.5) {
																								if (world instanceof ServerLevel _level) {
																									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMOND_LEGGINGS.get()));
																									entityToSpawn.setPickUpDelay(10);
																									entityToSpawn.setUnlimitedLifetime();
																									_level.addFreshEntity(entityToSpawn);
																								}
																							} else if (c >= 7.6) {
																								if (world instanceof ServerLevel _level) {
																									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMOND_BOOTS.get()));
																									entityToSpawn.setPickUpDelay(10);
																									entityToSpawn.setUnlimitedLifetime();
																									_level.addFreshEntity(entityToSpawn);
																								}
																							}
																						}
																					} else {
																						c = Math.ceil(Math.random() * 10);
																						if (c <= 3.3) {
																							if (world instanceof ServerLevel _level) {
																								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELUPGRADEEMERAULDNETHERITE.get()));
																								entityToSpawn.setPickUpDelay(10);
																								entityToSpawn.setUnlimitedLifetime();
																								_level.addFreshEntity(entityToSpawn);
																							}
																						} else if (c >= 3.4 && c <= 6.7) {
																							if (world instanceof ServerLevel _level) {
																								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEEMERAULDNETHERITEHAMMER.get()));
																								entityToSpawn.setPickUpDelay(10);
																								entityToSpawn.setUnlimitedLifetime();
																								_level.addFreshEntity(entityToSpawn);
																							}
																						} else if (c >= 6.8) {
																							if (world instanceof ServerLevel _level) {
																								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEEMERAULDNETHERITEEXAVATOR.get()));
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
																							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDSWORD.get()));
																							entityToSpawn.setPickUpDelay(10);
																							entityToSpawn.setUnlimitedLifetime();
																							_level.addFreshEntity(entityToSpawn);
																						}
																					} else if (c >= 2.1 && c <= 4) {
																						if (world instanceof ServerLevel _level) {
																							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDPICKAXE.get()));
																							entityToSpawn.setPickUpDelay(10);
																							entityToSpawn.setUnlimitedLifetime();
																							_level.addFreshEntity(entityToSpawn);
																						}
																					} else if (c >= 4.1 && c <= 6) {
																						if (world instanceof ServerLevel _level) {
																							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDAXE.get()));
																							entityToSpawn.setPickUpDelay(10);
																							entityToSpawn.setUnlimitedLifetime();
																							_level.addFreshEntity(entityToSpawn);
																						}
																					} else if (c >= 6.1 && c <= 8) {
																						if (world instanceof ServerLevel _level) {
																							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDSHOVEL.get()));
																							entityToSpawn.setPickUpDelay(10);
																							entityToSpawn.setUnlimitedLifetime();
																							_level.addFreshEntity(entityToSpawn);
																						}
																					} else if (c >= 8.1) {
																						if (world instanceof ServerLevel _level) {
																							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDHOE.get()));
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
																						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULD_HELMET.get()));
																						entityToSpawn.setPickUpDelay(10);
																						entityToSpawn.setUnlimitedLifetime();
																						_level.addFreshEntity(entityToSpawn);
																					}
																				} else if (c >= 2.6 && c <= 5) {
																					if (world instanceof ServerLevel _level) {
																						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULD_CHESTPLATE.get()));
																						entityToSpawn.setPickUpDelay(10);
																						entityToSpawn.setUnlimitedLifetime();
																						_level.addFreshEntity(entityToSpawn);
																					}
																				} else if (c >= 5.1 && c <= 7.5) {
																					if (world instanceof ServerLevel _level) {
																						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULD_LEGGINGS.get()));
																						entityToSpawn.setPickUpDelay(10);
																						entityToSpawn.setUnlimitedLifetime();
																						_level.addFreshEntity(entityToSpawn);
																					}
																				} else if (c >= 7.6) {
																					if (world instanceof ServerLevel _level) {
																						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULD_BOOTS.get()));
																						entityToSpawn.setPickUpDelay(10);
																						entityToSpawn.setUnlimitedLifetime();
																						_level.addFreshEntity(entityToSpawn);
																					}
																				}
																			}
																		} else {
																			c = Math.ceil(Math.random() * 10);
																			if (c <= 3.3) {
																				if (world instanceof ServerLevel _level) {
																					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELUPGRADEGOLDNETHERITE.get()));
																					entityToSpawn.setPickUpDelay(10);
																					entityToSpawn.setUnlimitedLifetime();
																					_level.addFreshEntity(entityToSpawn);
																				}
																			} else if (c >= 3.4 && c <= 6.7) {
																				if (world instanceof ServerLevel _level) {
																					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEGOLDNETHERITEHAMMER.get()));
																					entityToSpawn.setPickUpDelay(10);
																					entityToSpawn.setUnlimitedLifetime();
																					_level.addFreshEntity(entityToSpawn);
																				}
																			} else if (c >= 6.8) {
																				if (world instanceof ServerLevel _level) {
																					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEGOLDNETHERITEEXAVATOR.get()));
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
																				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDSWORD.get()));
																				entityToSpawn.setPickUpDelay(10);
																				entityToSpawn.setUnlimitedLifetime();
																				_level.addFreshEntity(entityToSpawn);
																			}
																		} else if (c >= 2.1 && c <= 4) {
																			if (world instanceof ServerLevel _level) {
																				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDPICKAXE.get()));
																				entityToSpawn.setPickUpDelay(10);
																				entityToSpawn.setUnlimitedLifetime();
																				_level.addFreshEntity(entityToSpawn);
																			}
																		} else if (c >= 4.1 && c <= 6) {
																			if (world instanceof ServerLevel _level) {
																				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDAXE.get()));
																				entityToSpawn.setPickUpDelay(10);
																				entityToSpawn.setUnlimitedLifetime();
																				_level.addFreshEntity(entityToSpawn);
																			}
																		} else if (c >= 6.1 && c <= 8) {
																			if (world instanceof ServerLevel _level) {
																				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDSHOVEL.get()));
																				entityToSpawn.setPickUpDelay(10);
																				entityToSpawn.setUnlimitedLifetime();
																				_level.addFreshEntity(entityToSpawn);
																			}
																		} else if (c >= 8.1) {
																			if (world instanceof ServerLevel _level) {
																				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDHOE.get()));
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
																			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLD_HELMET.get()));
																			entityToSpawn.setPickUpDelay(10);
																			entityToSpawn.setUnlimitedLifetime();
																			_level.addFreshEntity(entityToSpawn);
																		}
																	} else if (c >= 2.6 && c <= 5) {
																		if (world instanceof ServerLevel _level) {
																			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLD_CHESTPLATE.get()));
																			entityToSpawn.setPickUpDelay(10);
																			entityToSpawn.setUnlimitedLifetime();
																			_level.addFreshEntity(entityToSpawn);
																		}
																	} else if (c >= 5.1 && c <= 7.5) {
																		if (world instanceof ServerLevel _level) {
																			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLD_LEGGINGS.get()));
																			entityToSpawn.setPickUpDelay(10);
																			entityToSpawn.setUnlimitedLifetime();
																			_level.addFreshEntity(entityToSpawn);
																		}
																	} else if (c >= 7.6) {
																		if (world instanceof ServerLevel _level) {
																			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLD_BOOTS.get()));
																			entityToSpawn.setPickUpDelay(10);
																			entityToSpawn.setUnlimitedLifetime();
																			_level.addFreshEntity(entityToSpawn);
																		}
																	}
																}
															} else {
																c = Math.ceil(Math.random() * 10);
																if (c <= 3.3) {
																	if (world instanceof ServerLevel _level) {
																		ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELUPGRADEIRONNETHERITE.get()));
																		entityToSpawn.setPickUpDelay(10);
																		entityToSpawn.setUnlimitedLifetime();
																		_level.addFreshEntity(entityToSpawn);
																	}
																} else if (c >= 3.4 && c <= 6.7) {
																	if (world instanceof ServerLevel _level) {
																		ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEIRONNETHERITEHAMMER.get()));
																		entityToSpawn.setPickUpDelay(10);
																		entityToSpawn.setUnlimitedLifetime();
																		_level.addFreshEntity(entityToSpawn);
																	}
																} else if (c >= 6.8) {
																	if (world instanceof ServerLevel _level) {
																		ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADEIRONNETHERITEEXAVATOR.get()));
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
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_SWORD.get()));
																	entityToSpawn.setPickUpDelay(10);
																	entityToSpawn.setUnlimitedLifetime();
																	_level.addFreshEntity(entityToSpawn);
																}
															} else if (c >= 2.1 && c <= 4) {
																if (world instanceof ServerLevel _level) {
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_PICKAXE.get()));
																	entityToSpawn.setPickUpDelay(10);
																	entityToSpawn.setUnlimitedLifetime();
																	_level.addFreshEntity(entityToSpawn);
																}
															} else if (c >= 4.1 && c <= 6) {
																if (world instanceof ServerLevel _level) {
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_AXE.get()));
																	entityToSpawn.setPickUpDelay(10);
																	entityToSpawn.setUnlimitedLifetime();
																	_level.addFreshEntity(entityToSpawn);
																}
															} else if (c >= 6.1 && c <= 8) {
																if (world instanceof ServerLevel _level) {
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_SHOVEL.get()));
																	entityToSpawn.setPickUpDelay(10);
																	entityToSpawn.setUnlimitedLifetime();
																	_level.addFreshEntity(entityToSpawn);
																}
															} else if (c >= 8.1) {
																if (world instanceof ServerLevel _level) {
																	ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_HOE.get()));
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
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_ARMOR_HELMET.get()));
																entityToSpawn.setPickUpDelay(10);
																entityToSpawn.setUnlimitedLifetime();
																_level.addFreshEntity(entityToSpawn);
															}
														} else if (c >= 2.6 && c <= 5) {
															if (world instanceof ServerLevel _level) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_ARMOR_CHESTPLATE.get()));
																entityToSpawn.setPickUpDelay(10);
																entityToSpawn.setUnlimitedLifetime();
																_level.addFreshEntity(entityToSpawn);
															}
														} else if (c >= 5.1 && c <= 7.5) {
															if (world instanceof ServerLevel _level) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_ARMOR_LEGGINGS.get()));
																entityToSpawn.setPickUpDelay(10);
																entityToSpawn.setUnlimitedLifetime();
																_level.addFreshEntity(entityToSpawn);
															}
														} else if (c >= 7.6) {
															if (world instanceof ServerLevel _level) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRON_ARMOR_BOOTS.get()));
																entityToSpawn.setPickUpDelay(10);
																entityToSpawn.setUnlimitedLifetime();
																_level.addFreshEntity(entityToSpawn);
															}
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
												if (Math.random() < 0.5) {
													if (Math.random() < 0.5) {
														if (Math.random() < 0.5) {
															if (Math.random() < 0.5) {
																world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.UPGRADENETHERITEBLOCKDIAMOND.get().defaultBlockState(), 3);
															} else {
																world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.UPGRADENETHERITEBLOCKEMERAULD.get().defaultBlockState(), 3);
															}
														} else {
															world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.UPGRADENETHERITEBLOCKGOLD.get().defaultBlockState(), 3);
														}
													} else {
														world.setBlock(BlockPos.containing(x, y, z), MoreVanillaModBlocks.UPGRADENETHERITEBLOCKIRON.get().defaultBlockState(), 3);
													}
												} else {
													world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHERITE_BLOCK.defaultBlockState(), 3);
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
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("more_vanilla", "luckblocknetherite"));
											if (template != null) {
												template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
									}
								} else {
									c = Math.ceil(Math.random() * 10);
									if (c <= 3.3) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.ADAPAXELNETHERITE.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 3.4 && c <= 6.7) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.NETHERITEHAMMER.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else if (c >= 6.8) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.NETHERITE_EXAVATOR.get()));
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
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_SWORD));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 2.1 && c <= 4) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_PICKAXE));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 4.1 && c <= 6) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_AXE));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 6.1 && c <= 8) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_SHOVEL));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								} else if (c >= 8.1) {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HOE));
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
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (c >= 2.6 && c <= 5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_CHESTPLATE));
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (c >= 5.1 && c <= 7.5) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_LEGGINGS));
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							} else if (c >= 7.6) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_BOOTS));
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							}
						}
					} else {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEDIAMONDINGOT.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEEMERAULDINGOT.get()));
											entityToSpawn.setPickUpDelay(10);
											entityToSpawn.setUnlimitedLifetime();
											_level.addFreshEntity(entityToSpawn);
										}
									}
								} else {
									if (world instanceof ServerLevel _level) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEGOLDINGOT.get()));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								}
							} else {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MoreVanillaModItems.UPGRADENETHERITEIRONINGOT.get()));
									entityToSpawn.setPickUpDelay(10);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_INGOT));
								entityToSpawn.setPickUpDelay(10);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_SCRAP));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.DIAMOND_BLOCK.defaultBlockState(), 3);
			}
		} else {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.5) {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.5) {
										if (Math.random() < 0.5) {
											if (Math.random() < 0.5) {
												if (world instanceof ServerLevel _level) {
													Entity entityToSpawn = MoreVanillaModEntities.UPGRADEDIAMONDBOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
													if (entityToSpawn != null) {
														entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
													}
												}
											} else {
												if (world instanceof ServerLevel _level) {
													Entity entityToSpawn = MoreVanillaModEntities.UPGRADEEMERALDBOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
													if (entityToSpawn != null) {
														entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
													}
												}
											}
										} else {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = MoreVanillaModEntities.UPGRADEGOLDBOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
												if (entityToSpawn != null) {
													entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
												}
											}
										}
									} else {
										if (world instanceof ServerLevel _level) {
											Entity entityToSpawn = MoreVanillaModEntities.UPGRADEIRONBOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
											if (entityToSpawn != null) {
												entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
											}
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
									Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
									}
								}
							}
						} else {
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
