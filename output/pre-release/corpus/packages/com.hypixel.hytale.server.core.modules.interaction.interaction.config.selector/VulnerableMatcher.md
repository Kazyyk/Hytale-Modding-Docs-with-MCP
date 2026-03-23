# VulnerableMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: SelectInteraction.EntityMatcher

public class VulnerableMatcher extends SelectInteraction.EntityMatcher

An entity matcher that filters targets to match only entities that are not invulnerable (do not have the `Invulnerable` component).

## Key Methods

- public static final BuilderCodec<VulnerableMatcher> CODEC = BuilderCodec.builder(VulnerableMatcher.class, VulnerableMatcher::new, BASE_CODEC)
- public boolean test0(Ref<EntityStore> sourceRef, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer)
- public EntityMatcher toPacket()

Also in this package: AOECircleSelector, AOECylinderSelector, ClientSourcedSelector, Direction, HorizontalSelector, PlayerMatcher, RaycastSelector, Result, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, RuntimeSelector, SelectorType, StabSelector

Complete API:
  public boolean test0(Ref<EntityStore> sourceRef, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer)
  public EntityMatcher toPacket()

Fields:
public static final BuilderCodec<VulnerableMatcher> CODEC
