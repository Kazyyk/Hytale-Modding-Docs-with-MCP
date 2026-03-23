# Timer

Type: enum | Package: com.hypixel.hytale.server.npc.util | Implements: Tickable

public class Timer implements Tickable

A general-purpose NPC timer with tick-based decrement. Supports running, paused, and stopped states, random restart values, and repeating behavior.

## Key Methods

- public void setRate(double rate)
- public void setMinRestartValue(double minRestartValue)
- public void setMaxValue(double maxValue)
- public void setValue(double v)
- public void setRepeating(boolean repeating)
- public double getValue()
- public boolean isInitialised()
- public void tick(float dt)
- public void start(double minStartValue, double maxStartValue, double minRestartValue, double maxValue, double rate, boolean repeating)
- public void resume()
- public void pause()
- public void addValue(double v)
- public void stop()
- public void restart()
- public boolean isInState(Timer.TimerState s)
- public boolean isPaused()
- public boolean isRunning()
- public boolean isStopped()
- public String asText()
- public String get()

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark (and 3 more)

Complete API:
  public void setRate(double rate)
  public void setMinRestartValue(double minRestartValue)
  public void setMaxValue(double maxValue)
  public void setValue(double v)
  public void setRepeating(boolean repeating)
  public double getValue()
  public boolean isInitialised()
  public void tick(float dt)
  public void start(double minStartValue, double maxStartValue, double minRestartValue, double maxValue, double rate, boolean repeating)
  public void resume()
  public void pause()
  public void addValue(double v)
  public void stop()
  public void restart()
  public boolean isInState(Timer.TimerState s)
  public boolean isPaused()
  public boolean isRunning()
  public boolean isStopped()
  private double pickNextTimerValue()

Fields:
private double value
private double minRestartValue
private double maxValue
private double rate
private boolean repeating
private Timer.TimerState state
private boolean initialised
