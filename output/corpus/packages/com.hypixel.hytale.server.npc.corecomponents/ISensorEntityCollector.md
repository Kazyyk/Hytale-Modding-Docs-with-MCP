# ISensorEntityCollector

Type: interface | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: RoleStateChange

public interface ISensorEntityCollector extends RoleStateChange

## Methods

- void init(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nonnull ComponentAccessor<EntityStore> var3)
- void collectMatching(@Nonnull Ref<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull ComponentAccessor<EntityStore> var3)
- void collectNonMatching(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)
- boolean terminateOnFirstMatch()
- void cleanup()
