# StressTestStartCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.debug.stresstest | Extends: AbstractAsyncWorldCommand

public class StressTestStartCommand extends AbstractAsyncWorldCommand

Async command that spawns stress test bots connecting to the server.

Also in this package: Bot, BotConfig, DumpType, StressTestCommand, StressTestState, StressTestStopCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context, World world)
  private static void start(String name, World world, BotConfig config, int initCount, double interval, StressTestStartCommand.DumpType dumpType, double dumpInterval, long thresholdNanos, double percentile, boolean shutdown)
  static void stop()

Fields:
protected static final AtomicReference<StressTestStartCommand.StressTestState> STATE
private static final String NAME_PREFIX
public static final List<Bot> BOTS
private static final Message MESSAGE_COMMANDS_STRESS_TEST_ALREADY_STARTED
private static final Message MESSAGE_COMMANDS_STRESS_TEST_STARTED
static StressTestStartCommand.DumpType DUMP_TYPE
static Path DATE_PATH
static EventRegistration<String,AddPlayerToWorldEvent> EVENT_REGISTRATION
static ScheduledFuture<?> STRESS_TEST_BOT_TASK
static ScheduledFuture<?> STRESS_TEST_DUMP_TASK
private final OptionalArg<String> nameArg
private final DefaultArg<Integer> initCountArg
private final DefaultArg<Double> intervalArg
private final DefaultArg<StressTestStartCommand.DumpType> dumptypeArg
private final DefaultArg<Double> dumpintervalArg
private final OptionalArg<Double> thresholdArg
private final DefaultArg<Double> percentileArg
private final DefaultArg<Integer> viewRadiusArg
private final DefaultArg<Double> radiusArg
private final DefaultArg<Double> yheightArg
private final OptionalArg<Double> yheightMaxArg
private final DefaultArg<Double> flySpeedArg
private final FlagArg shutdownFlag
