# EntityFilterNot

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters | Extends: EntityFilterBase

public class EntityFilterNot extends EntityFilterBase

Composite filter that inverts the result of a single child filter (logical NOT).

Also in this package: EntityFilterAltitude, EntityFilterAnd, EntityFilterAttitude, EntityFilterCombat, EntityFilterEntityEffect, EntityFilterHeightDifference, EntityFilterInsideBlock, EntityFilterInventory, EntityFilterItemInHand, EntityFilterLineOfSight, EntityFilterMany, EntityFilterMovementState, EntityFilterNPCGroup, EntityFilterOr, EntityFilterSpotsMe, EntityFilterStandingOnBlock, EntityFilterStat, EntityFilterViewSector, EntityStatTarget, Mode (and 1 more)

Complete API:
  public boolean matchesEntity(Ref<EntityStore> ref, Ref<EntityStore> targetRef, Role role, Store<EntityStore> store)
  public int cost()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)

Fields:
protected final IEntityFilter filter
