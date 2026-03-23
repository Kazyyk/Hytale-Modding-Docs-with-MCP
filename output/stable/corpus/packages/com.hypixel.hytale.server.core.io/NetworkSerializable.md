# NetworkSerializable

Type: interface | Package: com.hypixel.hytale.server.core.io

public interface NetworkSerializable<Packet>

Generic interface for objects that can convert themselves into a network packet representation.

## Type Parameters

- `Packet` -- the packet type this object serializes to.

## Methods


Packet toPacket()

Converts this object into its packet representation for network transmission.

Known implementors: AbilityEffects, AmbienceFX, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AngledWielding, ApplicationEffects, AssetIconProperties, AudioCategory, Bench, BenchTierLevel, BenchUpgradeRequirement, BlockBoundingBoxes, BlockBreakingDecal, BlockBreakingDropType, BlockFaceSupport, BlockGathering, BlockGroup, BlockIdMatcher, BlockMatcher, BlockMovementSettings, BlockParticleSet, BlockPlacementSettings, BlockSelection, BlockSelectorToolData, BlockSet, BlockSoundSet, BlockType, BrushData, BuilderTool, BuilderToolData, CameraAxis, CameraSettings, CameraShake, CameraShakeConfig, ClampConfig, Cloud, CommonAsset, DamageEffects, DeployableConfig, DetailBox, EasingConfig, EntityEffect, EntityMatcher, EntityStatEffects, EntityStatOnHit, EntityStatType, EntityUIComponent, Environment, EqualizerEffect, FieldcraftCategory, Fluid, FluidFX, FluidParticle, Force, HarvestingDropType, HitEntity, HitboxCollisionConfig, Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionRules, Inventory, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemEntityConfig, ItemGlider, ItemPlayerAnimations, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig, ItemSoundSet, ItemStack, ItemTool, ItemToolSpec, ItemTranslationProperties, ItemUtility, ItemWeapon, MaterialQuantity, Model, ModelAttachment, ModelOverride, ModelParticle, ModelVFX, Modifier, MovementConfig, MovementEffects, NoiseConfig, Objective, OffsetNoise, Particle, ParticleAnimationFrame, ParticleAttractor, ParticleCollision, ParticleSpawner, ParticleSpawnerGroup, ParticleSystem, PhysicsConfig, ProjectileConfig, RepulsionConfig, RequiredBlockFaceSupport, ResourceType, ReverbEffect, RootInteraction, Rotation, RotationNoise, SelectorType, SoftBlockDropType, SoundEvent, SoundEventLayer, SoundSet, TagPattern, ToolArg, Trail, VariantRotation, VelocityConfig, ViewBobbing, Weather, WorldMap, WorldParticle

Also in this package: DisconnectReason, NetworkSerializer, NetworkSerializers, PacketHandler, PacketStatsEntry, PacketStatsRecorderImpl, PingInfo, ProtocolVersion, ServerManager, SizeRecord

Complete API:
  Packet toPacket()
