---
title: "com.hypixel.hytale.protocol"
package: "com.hypixel.hytale.protocol"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
---

**Package:** `com.hypixel.hytale.protocol`

This package contains 397 types that define the Hytale binary protocol layer. It includes packet interfaces, serializable data structures, interaction types, entity component updates, selectors, parameter values, and enums encoding game constants.

All serializable types follow a uniform `ByteBuf`-based binary protocol with nullable bit fields, fixed blocks, variable-length sections, and VarInt length prefixes. Multi-byte values use little-endian encoding.

## Interfaces

| Type | Description |
|---|---|
| [Packet](Packet.md) | API |
| [ToClientPacket](ToClientPacket.md) | API |
| [ToServerPacket](ToServerPacket.md) | API |

## Abstract Classes

| Type | Description |
|---|---|
| [ComponentUpdate](ComponentUpdate.md) |  |
| [Interaction](Interaction.md) |  |
| [ParamValue](ParamValue.md) | API |
| [Selector](Selector.md) |  |

## Classes

| Type | Description |
|---|---|
| [AOECircleSelector](AOECircleSelector.md) |  |
| [AOECylinderSelector](AOECylinderSelector.md) |  |
| [AbilityEffects](AbilityEffects.md) |  |
| [ActiveAnimationsUpdate](ActiveAnimationsUpdate.md) |  |
| [AmbienceFX](AmbienceFX.md) |  |
| [AmbienceFXAmbientBed](AmbienceFXAmbientBed.md) |  |
| [AmbienceFXBlockSoundSet](AmbienceFXBlockSoundSet.md) |  |
| [AmbienceFXConditions](AmbienceFXConditions.md) |  |
| [AmbienceFXMusic](AmbienceFXMusic.md) |  |
| [AmbienceFXSound](AmbienceFXSound.md) |  |
| [AmbienceFXSoundEffect](AmbienceFXSoundEffect.md) |  |
| [AngledDamage](AngledDamage.md) |  |
| [AngledWielding](AngledWielding.md) |  |
| [Animation](Animation.md) |  |
| [AnimationSet](AnimationSet.md) |  |
| [ApplicationEffects](ApplicationEffects.md) |  |
| [AppliedForce](AppliedForce.md) |  |
| [ApplyEffectInteraction](ApplyEffectInteraction.md) |  |
| [ApplyForceInteraction](ApplyForceInteraction.md) |  |
| [Asset](Asset.md) |  |
| [AssetIconProperties](AssetIconProperties.md) |  |
| [AudioCategory](AudioCategory.md) |  |
| [AudioUpdate](AudioUpdate.md) |  |
| [Bench](Bench.md) |  |
| [BenchRequirement](BenchRequirement.md) | API |
| [BenchTierLevel](BenchTierLevel.md) |  |
| [BenchUpgradeRequirement](BenchUpgradeRequirement.md) |  |
| [BlockBreaking](BlockBreaking.md) | API |
| [BlockBreakingDecal](BlockBreakingDecal.md) |  |
| [BlockConditionInteraction](BlockConditionInteraction.md) |  |
| [BlockFaceSupport](BlockFaceSupport.md) |  |
| [BlockFlags](BlockFlags.md) | API |
| [BlockGathering](BlockGathering.md) |  |
| [BlockGroup](BlockGroup.md) |  |
| [BlockIdMatcher](BlockIdMatcher.md) |  |
| [BlockMatcher](BlockMatcher.md) |  |
| [BlockMount](BlockMount.md) |  |
| [BlockMovementSettings](BlockMovementSettings.md) |  |
| [BlockParticleSet](BlockParticleSet.md) |  |
| [BlockPlacementSettings](BlockPlacementSettings.md) |  |
| [BlockPosition](BlockPosition.md) | API |
| [BlockRotation](BlockRotation.md) | API |
| [BlockSelectorToolData](BlockSelectorToolData.md) |  |
| [BlockSet](BlockSet.md) |  |
| [BlockSoundSet](BlockSoundSet.md) |  |
| [BlockTextures](BlockTextures.md) | API |
| [BlockType](BlockType.md) |  |
| [BlockUpdate](BlockUpdate.md) |  |
| [BoolParamValue](BoolParamValue.md) |  |
| [BreakBlockInteraction](BreakBlockInteraction.md) |  |
| [BuilderToolInteraction](BuilderToolInteraction.md) |  |
| [CachedPacket](CachedPacket.md) | API |
| [CameraAxis](CameraAxis.md) |  |
| [CameraInteraction](CameraInteraction.md) |  |
| [CameraSettings](CameraSettings.md) |  |
| [CameraShake](CameraShake.md) |  |
| [CameraShakeConfig](CameraShakeConfig.md) |  |
| [CancelChainInteraction](CancelChainInteraction.md) |  |
| [ChainFlagInteraction](ChainFlagInteraction.md) |  |
| [ChainingInteraction](ChainingInteraction.md) |  |
| [ChangeActiveSlotInteraction](ChangeActiveSlotInteraction.md) |  |
| [ChangeBlockInteraction](ChangeBlockInteraction.md) |  |
| [ChangeStatInteraction](ChangeStatInteraction.md) |  |
| [ChangeStateInteraction](ChangeStateInteraction.md) |  |
| [ChargingDelay](ChargingDelay.md) |  |
| [ChargingInteraction](ChargingInteraction.md) |  |
| [ClampConfig](ClampConfig.md) |  |
| [ClearEntityEffectInteraction](ClearEntityEffectInteraction.md) |  |
| [Cloud](Cloud.md) |  |
| [Color](Color.md) |  |
| [ColorAlpha](ColorAlpha.md) |  |
| [ColorLight](ColorLight.md) | API |
| [CombatTextEntityUIComponentAnimationEvent](CombatTextEntityUIComponentAnimationEvent.md) |  |
| [CombatTextUpdate](CombatTextUpdate.md) |  |
| [ConditionInteraction](ConditionInteraction.md) |  |
| [ConnectedBlockRuleSet](ConnectedBlockRuleSet.md) |  |
| [CooldownConditionInteraction](CooldownConditionInteraction.md) |  |
| [CraftingRecipe](CraftingRecipe.md) |  |
| [DamageCause](DamageCause.md) |  |
| [DamageEffects](DamageEffects.md) |  |
| [DamageEntityInteraction](DamageEntityInteraction.md) |  |
| [DeployableConfig](DeployableConfig.md) |  |
| [DetailBox](DetailBox.md) |  |
| [Direction](Direction.md) | API |
| [DoubleParamValue](DoubleParamValue.md) |  |
| [DynamicLightUpdate](DynamicLightUpdate.md) |  |
| [EasingConfig](EasingConfig.md) |  |
| [Edge](Edge.md) |  |
| [EffectConditionInteraction](EffectConditionInteraction.md) |  |
| [EntityEffect](EntityEffect.md) |  |
| [EntityEffectUpdate](EntityEffectUpdate.md) |  |
| [EntityEffectsUpdate](EntityEffectsUpdate.md) |  |
| [EntityMatcher](EntityMatcher.md) |  |
| [EntityStatEffects](EntityStatEffects.md) |  |
| [EntityStatOnHit](EntityStatOnHit.md) |  |
| [EntityStatType](EntityStatType.md) |  |
| [EntityStatUpdate](EntityStatUpdate.md) | API |
| [EntityStatsUpdate](EntityStatsUpdate.md) |  |
| [EntityUIComponent](EntityUIComponent.md) |  |
| [EntityUpdate](EntityUpdate.md) |  |
| [EqualizerEffect](EqualizerEffect.md) |  |
| `Equipment` |  |
| [EquipmentUpdate](EquipmentUpdate.md) |  |
| [ExtraResources](ExtraResources.md) |  |
| [FirstClickInteraction](FirstClickInteraction.md) |  |
| [FloatRange](FloatRange.md) |  |
| [Fluid](Fluid.md) |  |
| [FluidFX](FluidFX.md) |  |
| [FluidFXMovementSettings](FluidFXMovementSettings.md) |  |
| [FluidParticle](FluidParticle.md) |  |
| [FogOptions](FogOptions.md) |  |
| [ForkedChainId](ForkedChainId.md) | API |
| [FormattedMessage](FormattedMessage.md) | API |
| [HalfFloatPosition](HalfFloatPosition.md) |  |
| [Harvesting](Harvesting.md) | API |
| [HitEntity](HitEntity.md) |  |
| [Hitbox](Hitbox.md) | API |
| [HitboxCollisionConfig](HitboxCollisionConfig.md) |  |
| [HitboxCollisionUpdate](HitboxCollisionUpdate.md) |  |
| [HorizontalSelector](HorizontalSelector.md) |  |
| [HostAddress](HostAddress.md) | API |
| [IncrementCooldownInteraction](IncrementCooldownInteraction.md) |  |
| [InitialVelocity](InitialVelocity.md) |  |
| [InstantData](InstantData.md) |  |
| [IntParamValue](IntParamValue.md) |  |
| [IntangibleUpdate](IntangibleUpdate.md) |  |
| [InteractableUpdate](InteractableUpdate.md) |  |
| [InteractionCamera](InteractionCamera.md) | API |
| [InteractionCameraSettings](InteractionCameraSettings.md) |  |
| [InteractionChainData](InteractionChainData.md) | API |
| [InteractionConfiguration](InteractionConfiguration.md) |  |
| [InteractionCooldown](InteractionCooldown.md) | API |
| [InteractionEffects](InteractionEffects.md) |  |
| [InteractionPriority](InteractionPriority.md) |  |
| [InteractionRules](InteractionRules.md) |  |
| [InteractionSettings](InteractionSettings.md) | API |
| [InteractionSyncData](InteractionSyncData.md) | API |
| [InteractionsUpdate](InteractionsUpdate.md) |  |
| [IntersectionHighlight](IntersectionHighlight.md) |  |
| [InventorySection](InventorySection.md) | API |
| [InvulnerableUpdate](InvulnerableUpdate.md) |  |
| [ItemAnimation](ItemAnimation.md) |  |
| [ItemAppearanceCondition](ItemAppearanceCondition.md) |  |
| [ItemArmor](ItemArmor.md) |  |
| [ItemBase](ItemBase.md) | API |
| `ItemBuilderToolData` | API |
| [ItemCategory](ItemCategory.md) |  |
| [ItemEntityConfig](ItemEntityConfig.md) |  |
| [ItemGlider](ItemGlider.md) |  |
| [ItemLibrary](ItemLibrary.md) |  |
| [ItemPlayerAnimations](ItemPlayerAnimations.md) |  |
| [ItemPullbackConfiguration](ItemPullbackConfiguration.md) | API |
| [ItemQuality](ItemQuality.md) |  |
| [ItemQuantity](ItemQuantity.md) | API |
| [ItemResourceType](ItemResourceType.md) | API |
| [ItemReticle](ItemReticle.md) |  |
| [ItemReticleConfig](ItemReticleConfig.md) |  |
| [ItemSoundSet](ItemSoundSet.md) |  |
| [ItemTool](ItemTool.md) |  |
| [ItemToolSpec](ItemToolSpec.md) |  |
| [ItemTranslationProperties](ItemTranslationProperties.md) |  |
| [ItemUpdate](ItemUpdate.md) |  |
| [ItemUtility](ItemUtility.md) |  |
| [ItemWeapon](ItemWeapon.md) |  |
| [ItemWithAllMetadata](ItemWithAllMetadata.md) | API |
| [LongParamValue](LongParamValue.md) |  |
| [MaterialQuantity](MaterialQuantity.md) |  |
| [MemoriesConditionInteraction](MemoriesConditionInteraction.md) |  |
| [Model](Model.md) |  |
| [ModelAttachment](ModelAttachment.md) |  |
| [ModelDisplay](ModelDisplay.md) | API |
| [ModelOverride](ModelOverride.md) |  |
| [ModelParticle](ModelParticle.md) |  |
| [ModelTexture](ModelTexture.md) | API |
| [ModelTrail](ModelTrail.md) | API |
| [ModelTransform](ModelTransform.md) | API |
| [ModelUpdate](ModelUpdate.md) |  |
| [ModelVFX](ModelVFX.md) |  |
| [Modifier](Modifier.md) |  |
| [ModifyInventoryInteraction](ModifyInventoryInteraction.md) |  |
| [MountedUpdate](MountedUpdate.md) |  |
| [MouseButtonEvent](MouseButtonEvent.md) | API |
| [MouseMotionEvent](MouseMotionEvent.md) | API |
| [MovementConditionInteraction](MovementConditionInteraction.md) |  |
| [MovementEffects](MovementEffects.md) |  |
| [MovementSettings](MovementSettings.md) |  |
| [MovementStates](MovementStates.md) | API |
| [MovementStatesUpdate](MovementStatesUpdate.md) |  |
| `Nameplate` |  |
| [NameplateUpdate](NameplateUpdate.md) |  |
| [NearFar](NearFar.md) |  |
| [NewSpawnUpdate](NewSpawnUpdate.md) |  |
| [NoiseConfig](NoiseConfig.md) |  |
| [Objective](Objective.md) |  |
| [ObjectiveTask](ObjectiveTask.md) |  |
| [OffsetNoise](OffsetNoise.md) |  |
| [PacketRegistry](PacketRegistry.md) |  |
| [ParallelInteraction](ParallelInteraction.md) |  |
| [Particle](Particle.md) |  |
| [ParticleAnimationFrame](ParticleAnimationFrame.md) |  |
| [ParticleAttractor](ParticleAttractor.md) |  |
| [ParticleCollision](ParticleCollision.md) |  |
| [ParticleSpawner](ParticleSpawner.md) |  |
| [ParticleSpawnerGroup](ParticleSpawnerGroup.md) |  |
| [ParticleSystem](ParticleSystem.md) |  |
| [PhysicsConfig](PhysicsConfig.md) |  |
| [PickBlockInteraction](PickBlockInteraction.md) |  |
| [PlaceBlockInteraction](PlaceBlockInteraction.md) |  |
| [PlayerSkin](PlayerSkin.md) | API |
| [PlayerSkinUpdate](PlayerSkinUpdate.md) |  |
| [Position](Position.md) | API |
| [PredictionUpdate](PredictionUpdate.md) |  |
| [ProjectileConfig](ProjectileConfig.md) |  |
| [ProjectileInteraction](ProjectileInteraction.md) |  |
| [PropUpdate](PropUpdate.md) |  |
| [ProtocolSettings](ProtocolSettings.md) |  |
| [RailConfig](RailConfig.md) | API |
| [RailPoint](RailPoint.md) | API |
| [Range](Range.md) |  |
| [RangeVector2f](RangeVector2f.md) |  |
| [RangeVector3f](RangeVector3f.md) |  |
| [Rangeb](Rangeb.md) |  |
| [Rangef](Rangef.md) | API |
| [RaycastSelector](RaycastSelector.md) |  |
| [RemoveEntityInteraction](RemoveEntityInteraction.md) |  |
| [RepeatInteraction](RepeatInteraction.md) |  |
| [ReplaceInteraction](ReplaceInteraction.md) |  |
| [RepulsionConfig](RepulsionConfig.md) |  |
| [RepulsionUpdate](RepulsionUpdate.md) |  |
| [RequiredBlockFaceSupport](RequiredBlockFaceSupport.md) |  |
| [ResetCooldownInteraction](ResetCooldownInteraction.md) |  |
| [ResourceType](ResourceType.md) |  |
| [RespondToHitUpdate](RespondToHitUpdate.md) |  |
| [ReverbEffect](ReverbEffect.md) |  |
| [RoofConnectedBlockRuleSet](RoofConnectedBlockRuleSet.md) | API |
| [RootInteraction](RootInteraction.md) |  |
| [RootInteractionSettings](RootInteractionSettings.md) | API |
| [RotationNoise](RotationNoise.md) |  |
| [RunRootInteraction](RunRootInteraction.md) |  |
| [SavedMovementStates](SavedMovementStates.md) | API |
| [SelectInteraction](SelectInteraction.md) |  |
| [SelectedHitEntity](SelectedHitEntity.md) | API |
| [SerialInteraction](SerialInteraction.md) |  |
| [ServerCameraSettings](ServerCameraSettings.md) |  |
| [SimpleBlockInteraction](SimpleBlockInteraction.md) |  |
| [SimpleInteraction](SimpleInteraction.md) |  |
| [Size](Size.md) |  |
| [SoftBlock](SoftBlock.md) | API |
| [SoundEvent](SoundEvent.md) |  |
| [SoundEventLayer](SoundEventLayer.md) |  |
| [SoundEventLayerRandomSettings](SoundEventLayerRandomSettings.md) |  |
| [SoundSet](SoundSet.md) |  |
| [SpawnDeployableFromRaycastInteraction](SpawnDeployableFromRaycastInteraction.md) |  |
| [StabSelector](StabSelector.md) |  |
| [StairConnectedBlockRuleSet](StairConnectedBlockRuleSet.md) | API |
| [StatsConditionInteraction](StatsConditionInteraction.md) |  |
| [StringParamValue](StringParamValue.md) |  |
| [TagPattern](TagPattern.md) |  |
| [TargetedDamage](TargetedDamage.md) |  |
| [TeleportAck](TeleportAck.md) |  |
| [Tint](Tint.md) | API |
| [ToggleGliderInteraction](ToggleGliderInteraction.md) |  |
| [Trail](Trail.md) |  |
| [Transform](Transform.md) |  |
| [TransformUpdate](TransformUpdate.md) |  |
| [TriggerCooldownInteraction](TriggerCooldownInteraction.md) |  |
| [UIComponentsUpdate](UIComponentsUpdate.md) |  |
| [UVMotion](UVMotion.md) |  |
| [UseBlockInteraction](UseBlockInteraction.md) |  |
| [UseEntityInteraction](UseEntityInteraction.md) |  |
| [Vector2f](Vector2f.md) | API |
| [Vector2i](Vector2i.md) |  |
| [Vector3d](Vector3d.md) |  |
| [Vector3f](Vector3f.md) |  |
| [Vector3i](Vector3i.md) |  |
| [VelocityConfig](VelocityConfig.md) |  |
| [ViewBobbing](ViewBobbing.md) |  |
| [Weather](Weather.md) |  |
| [WeatherParticle](WeatherParticle.md) |  |
| [WieldingInteraction](WieldingInteraction.md) |  |
| [WiggleWeights](WiggleWeights.md) |  |
| [WorldEnvironment](WorldEnvironment.md) |  |
| [WorldInteraction](WorldInteraction.md) |  |
| [WorldParticle](WorldParticle.md) |  |

## Enums

| Type | Description |
|---|---|
| [AccumulationMode](AccumulationMode.md) |  |
| [AmbienceFXAltitude](AmbienceFXAltitude.md) |  |
| [AmbienceFXSoundPlay3D](AmbienceFXSoundPlay3D.md) |  |
| [AmbienceTransitionSpeed](AmbienceTransitionSpeed.md) |  |
| [AnimationSlot](AnimationSlot.md) |  |
| [ApplyForceState](ApplyForceState.md) | API |
| [ApplyLookType](ApplyLookType.md) |  |
| [ApplyMovementType](ApplyMovementType.md) |  |
| [AttachedToType](AttachedToType.md) |  |
| [BenchType](BenchType.md) | API |
| [BlockFace](BlockFace.md) |  |
| [BlockMaterial](BlockMaterial.md) | API |
| [BlockMountType](BlockMountType.md) |  |
| [BlockNeighbor](BlockNeighbor.md) | API |
| [BlockParticleEvent](BlockParticleEvent.md) | API |
| [BlockPlacementRotationMode](BlockPlacementRotationMode.md) | API |
| [BlockPreviewVisibility](BlockPreviewVisibility.md) | API |
| [BlockSoundEvent](BlockSoundEvent.md) |  |
| [BlockSupportsRequiredForType](BlockSupportsRequiredForType.md) |  |
| [CalculationType](CalculationType.md) |  |
| [CameraActionType](CameraActionType.md) |  |
| [CameraNode](CameraNode.md) | API |
| [CameraPerspectiveType](CameraPerspectiveType.md) |  |
| [CanMoveType](CanMoveType.md) |  |
| [ChangeStatBehaviour](ChangeStatBehaviour.md) | API |
| [ChangeVelocityType](ChangeVelocityType.md) | API |
| [ClickType](ClickType.md) |  |
| [ClientCameraView](ClientCameraView.md) |  |
| [CollisionType](CollisionType.md) |  |
| [CombatTextEntityUIAnimationEventType](CombatTextEntityUIAnimationEventType.md) |  |
| [ComponentUpdateType](ComponentUpdateType.md) |  |
| [ConnectedBlockRuleSetType](ConnectedBlockRuleSetType.md) | API |
| [Cosmetic](Cosmetic.md) | API |
| [CurveType](CurveType.md) |  |
| [DebugShape](DebugShape.md) |  |
| [DrawType](DrawType.md) | API |
| [EasingType](EasingType.md) |  |
| [EffectDirection](EffectDirection.md) |  |
| [EffectOp](EffectOp.md) |  |
| [EmitShape](EmitShape.md) |  |
| [EntityMatcherType](EntityMatcherType.md) |  |
| [EntityPart](EntityPart.md) | API |
| [EntityStatOp](EntityStatOp.md) | API |
| [EntityStatResetBehavior](EntityStatResetBehavior.md) | API |
| [EntityUIType](EntityUIType.md) |  |
| [FXRenderMode](FXRenderMode.md) |  |
| [FailOnType](FailOnType.md) |  |
| [FluidDrawType](FluidDrawType.md) | API |
| [FluidFog](FluidFog.md) |  |
| [GameMode](GameMode.md) | API |
| [HorizontalSelectorDirection](HorizontalSelectorDirection.md) |  |
| [InteractionState](InteractionState.md) | API |
| [InteractionTarget](InteractionTarget.md) |  |
| [InteractionType](InteractionType.md) | API |
| [InventoryActionType](InventoryActionType.md) |  |
| [ItemArmorSlot](ItemArmorSlot.md) | API |
| [ItemGridInfoDisplayMode](ItemGridInfoDisplayMode.md) |  |
| [ItemReticleClientEvent](ItemReticleClientEvent.md) |  |
| [ItemSoundEvent](ItemSoundEvent.md) |  |
| [LoopOption](LoopOption.md) |  |
| [Match](Match.md) |  |
| [MaybeBool](MaybeBool.md) | API |
| [ModifierTarget](ModifierTarget.md) |  |
| [MountController](MountController.md) |  |
| [MouseButtonState](MouseButtonState.md) | API |
| [MouseButtonType](MouseButtonType.md) | API |
| [MouseInputTargetType](MouseInputTargetType.md) |  |
| [MouseInputType](MouseInputType.md) |  |
| [MovementDirection](MovementDirection.md) | API |
| [MovementForceRotationType](MovementForceRotationType.md) |  |
| [MovementType](MovementType.md) |  |
| [NetworkChannel](NetworkChannel.md) | API |
| [NoiseType](NoiseType.md) |  |
| [Opacity](Opacity.md) | API |
| [OverlapBehavior](OverlapBehavior.md) |  |
| [ParticleCollisionAction](ParticleCollisionAction.md) |  |
| [ParticleCollisionBlockType](ParticleCollisionBlockType.md) |  |
| [ParticleRotationInfluence](ParticleRotationInfluence.md) |  |
| [ParticleScaleRatioConstraint](ParticleScaleRatioConstraint.md) |  |
| [ParticleUVOption](ParticleUVOption.md) |  |
| [Phobia](Phobia.md) | API |
| [PhysicsType](PhysicsType.md) |  |
| [PickupLocation](PickupLocation.md) | API |
| [PositionDistanceOffsetType](PositionDistanceOffsetType.md) |  |
| [PositionType](PositionType.md) |  |
| [PrioritySlot](PrioritySlot.md) | API |
| [RandomRotation](RandomRotation.md) | API |
| [RaycastMode](RaycastMode.md) |  |
| [Rotation](Rotation.md) |  |
| [RotationMode](RotationMode.md) |  |
| [RotationType](RotationType.md) |  |
| [ShaderType](ShaderType.md) | API |
| [ShadingMode](ShadingMode.md) | API |
| [SmartMoveType](SmartMoveType.md) | API |
| [SoftParticle](SoftParticle.md) |  |
| `SortType` |  |
| [SoundCategory](SoundCategory.md) |  |
| [SupportMatch](SupportMatch.md) | API |
| [SwitchTo](SwitchTo.md) |  |
| [TagPatternType](TagPatternType.md) |  |
| [UVMotionCurveType](UVMotionCurveType.md) |  |
| [UpdateType](UpdateType.md) |  |
| [ValueType](ValueType.md) | API |
| [VariantRotation](VariantRotation.md) |  |
| [VelocityThresholdStyle](VelocityThresholdStyle.md) | API |
| [WaitForDataFrom](WaitForDataFrom.md) | API |
