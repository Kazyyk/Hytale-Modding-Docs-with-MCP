# ISensorEntityPrioritiser

Type: interface | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: RoleStateChange

public interface ISensorEntityPrioritiser extends RoleStateChange

## Methods

- IEntityByPriorityFilter getNPCPrioritiser()
- IEntityByPriorityFilter getPlayerPrioritiser()
- Ref<EntityStore> pickTarget(Ref<EntityStore> var1, Role var2, Vector3d var3, Ref<EntityStore> var4, Ref<EntityStore> var5, boolean var6, Store<EntityStore> var7)
- boolean providesFilters()
- void buildProvidedFilters(List<IEntityFilter> var1)
