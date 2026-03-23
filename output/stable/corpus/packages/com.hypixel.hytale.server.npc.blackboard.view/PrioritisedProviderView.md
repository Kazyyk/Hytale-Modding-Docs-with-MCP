# PrioritisedProviderView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view | Extends: IBlackboardView<ViewType>> | Implements: IBlackboardView<ViewType>

public abstract class PrioritisedProviderView<T, ViewType extends IBlackboardView<ViewType>> implements IBlackboardView<ViewType>

Implementation of `IBlackboardView<ViewType>`.

## Fields

- LOWEST_PRIORITY | int | Static final int field.

## Methods

- registerProvider(int priority, T provider) | void | public method.

Known subclasses: AttitudeView, InteractionView

Also in this package: BlockRegionView, BlockRegionViewManager, IBlackboardView, IBlackboardViewManager, PrioritisedProvider, SingletonBlackboardViewManager

Complete API:
  public void registerProvider(int priority, T provider)

Fields:
public static final int LOWEST_PRIORITY
protected List<PrioritisedProviderView.PrioritisedProvider<T>> providers
