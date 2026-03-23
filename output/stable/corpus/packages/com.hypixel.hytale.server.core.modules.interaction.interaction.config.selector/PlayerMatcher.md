# PlayerMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector | Extends: SelectInteraction.EntityMatcher

public class PlayerMatcher extends SelectInteraction.EntityMatcher

An entity matcher that filters targets to only match player entities by checking for the `Player` component type.

## Key Methods

- public static final BuilderCodec<PlayerMatcher> CODEC = BuilderCodec.builder(PlayerMatcher.class, PlayerMatcher::new, BASE_CODEC)
- public boolean test0(Ref<EntityStore> sourceRef, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer)
- public EntityMatcher toPacket()
