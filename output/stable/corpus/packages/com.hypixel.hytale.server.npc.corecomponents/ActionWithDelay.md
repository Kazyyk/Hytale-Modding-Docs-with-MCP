# ActionWithDelay

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents | Extends: ActionBase

public abstract class ActionWithDelay extends ActionBase

## Fields

- private final double[] delayRange
- private double delay
- private boolean isDelaying

## Constructors

- public ActionWithDelay(@Nonnull BuilderActionWithDelay builder, @Nonnull BuilderSupport support)

## Methods

- @Override public boolean processDelay(float dt)
- protected boolean isDelaying()
- protected boolean isDelayPrepared()
- protected void prepareDelay()
- protected void clearDelay()
- protected void startDelay(@Nonnull EntitySupport support)
