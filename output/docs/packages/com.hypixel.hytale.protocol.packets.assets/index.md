---
title: "com.hypixel.hytale.protocol.packets.assets"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.assets"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:59:19Z"
tags:
  - "protocol"
  - "packet"
  - "assets"
---

**Package:** `com.hypixel.hytale.protocol.packets.assets`

This package contains 46 server-to-client asset update packets that transmit game asset definitions (block types, items, sounds, particles, interactions, etc.) from the server to connected clients. All types implement `Packet` and `ToClientPacket`, except `TrackOrUpdateObjective` and `UntrackObjective` which are objective-tracking packets, and `UpdateObjectiveTask` which updates individual objective tasks.

All packets use the Hytale binary protocol with nullable bit fields, fixed blocks, variable-length sections, and VarInt length prefixes. Most packets in this package are compressed (`IS_COMPRESSED = true`).

## Objective Packets

| Type | Packet ID | Description |
|---|---|---|
| [TrackOrUpdateObjective](TrackOrUpdateObjective.md) | 69 | Begins tracking or updates an objective on the client. |
| [UntrackObjective](UntrackObjective.md) | 70 | Stops tracking an objective identified by UUID. |

## Asset Update Packets

| Type | Packet ID | Compressed | Key Type | Description |
|---|---|---|---|---|
| [UpdateAmbienceFX](UpdateAmbienceFX.md) | 62 | Yes | `Map<Integer, AmbienceFX>` | Transmits AmbienceFX asset definitions. |
| [UpdateAudioCategories](UpdateAudioCategories.md) | 80 | Yes | `Map<Integer, AudioCategory>` | Transmits AudioCategories asset definitions. |
| [UpdateBlockBreakingDecals](UpdateBlockBreakingDecals.md) | 45 | Yes | `Map<String, BlockBreakingDecal>` | Transmits BlockBreakingDecals asset definitions. |
| [UpdateBlockGroups](UpdateBlockGroups.md) | 78 | Yes | `Map<String, BlockGroup>` | Transmits BlockGroups asset definitions. |
| [UpdateBlockHitboxes](UpdateBlockHitboxes.md) | 41 | Yes | `Map<Integer, Hitbox[]>` | Transmits BlockHitboxes asset definitions. |
| [UpdateBlockParticleSets](UpdateBlockParticleSets.md) | 44 | Yes | `Map<String, BlockParticleSet>` | Transmits BlockParticleSets asset definitions. |
| [UpdateBlockSets](UpdateBlockSets.md) | 46 | Yes | `Map<String, BlockSet>` | Transmits BlockSets asset definitions. |
| [UpdateBlockSoundSets](UpdateBlockSoundSets.md) | 42 | Yes | `Map<Integer, BlockSoundSet>` | Transmits BlockSoundSets asset definitions. |
| [UpdateBlockTypes](UpdateBlockTypes.md) | 40 | Yes | `Map<Integer, BlockType>` | Transmits BlockTypes asset definitions. |
| [UpdateCameraShake](UpdateCameraShake.md) | 77 | Yes | `Map<Integer, CameraShake>` | Transmits CameraShake asset definitions. |
| [UpdateEntityEffects](UpdateEntityEffects.md) | 51 | Yes | `Map<Integer, EntityEffect>` | Transmits EntityEffects asset definitions. |
| [UpdateEntityStatTypes](UpdateEntityStatTypes.md) | 72 | Yes | `Map<Integer, EntityStatType>` | Transmits EntityStatTypes asset definitions. |
| [UpdateEntityUIComponents](UpdateEntityUIComponents.md) | 73 | Yes | `Map<Integer, EntityUIComponent>` | Transmits EntityUIComponents asset definitions. |
| [UpdateEnvironments](UpdateEnvironments.md) | 61 | Yes | `Map<Integer, WorldEnvironment>` | Transmits Environments asset definitions. |
| [UpdateEqualizerEffects](UpdateEqualizerEffects.md) | 82 | Yes | `Map<Integer, EqualizerEffect>` | Transmits EqualizerEffects asset definitions. |
| [UpdateFieldcraftCategories](UpdateFieldcraftCategories.md) | 58 | Yes | `ItemCategory[]` | Transmits FieldcraftCategories asset definitions. |
| [UpdateFluidFX](UpdateFluidFX.md) | 63 | Yes | `Map<Integer, FluidFX>` | Transmits FluidFX asset definitions. |
| [UpdateFluids](UpdateFluids.md) | 83 | Yes | `Map<Integer, Fluid>` | Transmits Fluids asset definitions. |
| [UpdateHitboxCollisionConfig](UpdateHitboxCollisionConfig.md) | 74 | Yes | `Map<Integer, HitboxCollisionConfig>` | Transmits HitboxCollisionConfig asset definitions. |
| [UpdateInteractions](UpdateInteractions.md) | 66 | Yes | `Map<Integer, Interaction>` | Transmits Interactions asset definitions. |
| [UpdateItemCategories](UpdateItemCategories.md) | 56 | Yes | `ItemCategory[]` | Transmits ItemCategories asset definitions. |
| [UpdateItemPlayerAnimations](UpdateItemPlayerAnimations.md) | 52 | Yes | `Map<String, ItemPlayerAnimations>` | Transmits ItemPlayerAnimations asset definitions. |
| [UpdateItemQualities](UpdateItemQualities.md) | 55 | Yes | `Map<Integer, ItemQuality>` | Transmits ItemQualities asset definitions. |
| [UpdateItemReticles](UpdateItemReticles.md) | 57 | Yes | `Map<Integer, ItemReticleConfig>` | Transmits ItemReticles asset definitions. |
| [UpdateItemSoundSets](UpdateItemSoundSets.md) | 43 | Yes | `Map<Integer, ItemSoundSet>` | Transmits ItemSoundSets asset definitions. |
| [UpdateItems](UpdateItems.md) | 54 | Yes | `Map<String, ItemBase>` | Transmits Items asset definitions. |
| [UpdateModelvfxs](UpdateModelvfxs.md) | 53 | Yes | `Map<Integer, ModelVFX>` | Transmits Modelvfxs asset definitions. |
| [UpdateObjectiveTask](UpdateObjectiveTask.md) | 71 | No |  | Transmits ObjectiveTask asset definitions. |
| [UpdateParticleSpawners](UpdateParticleSpawners.md) | 50 | Yes | `Map<String, ParticleSpawner>` | Transmits ParticleSpawners asset definitions. |
| [UpdateParticleSystems](UpdateParticleSystems.md) | 49 | Yes | `Map<String, ParticleSystem>` | Transmits ParticleSystems asset definitions. |
| [UpdateProjectileConfigs](UpdateProjectileConfigs.md) | 85 | Yes | `Map<String, ProjectileConfig>` | Transmits ProjectileConfigs asset definitions. |
| [UpdateRecipes](UpdateRecipes.md) | 60 | Yes | `Map<String, CraftingRecipe>` | Transmits Recipes asset definitions. |
| [UpdateRepulsionConfig](UpdateRepulsionConfig.md) | 75 | Yes | `Map<Integer, RepulsionConfig>` | Transmits RepulsionConfig asset definitions. |
| [UpdateResourceTypes](UpdateResourceTypes.md) | 59 | Yes | `Map<String, ResourceType>` | Transmits ResourceTypes asset definitions. |
| [UpdateReverbEffects](UpdateReverbEffects.md) | 81 | Yes | `Map<Integer, ReverbEffect>` | Transmits ReverbEffects asset definitions. |
| [UpdateRootInteractions](UpdateRootInteractions.md) | 67 | Yes | `Map<Integer, RootInteraction>` | Transmits RootInteractions asset definitions. |
| [UpdateSoundEvents](UpdateSoundEvents.md) | 65 | Yes | `Map<Integer, SoundEvent>` | Transmits SoundEvents asset definitions. |
| [UpdateSoundSets](UpdateSoundSets.md) | 79 | Yes | `Map<Integer, SoundSet>` | Transmits SoundSets asset definitions. |
| [UpdateTagPatterns](UpdateTagPatterns.md) | 84 | Yes | `Map<Integer, TagPattern>` | Transmits TagPatterns asset definitions. |
| [UpdateTrails](UpdateTrails.md) | 48 | Yes | `Map<String, Trail>` | Transmits Trails asset definitions. |
| [UpdateTranslations](UpdateTranslations.md) | 64 | Yes | `Map<String, String>` | Transmits Translations asset definitions. |
| [UpdateUnarmedInteractions](UpdateUnarmedInteractions.md) | 68 | Yes | `Map<InteractionType, Integer>` | Transmits UnarmedInteractions asset definitions. |
| [UpdateViewBobbing](UpdateViewBobbing.md) | 76 | Yes | `Map<MovementType, ViewBobbing>` | Transmits ViewBobbing asset definitions. |
| [UpdateWeathers](UpdateWeathers.md) | 47 | Yes | `Map<Integer, Weather>` | Transmits Weathers asset definitions. |

