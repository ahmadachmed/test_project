package setups;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public DesiredCapabilities realAndroid(){
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "test");
        caps.setCapability(MobileCapabilityType.UDID, "c488dea0");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.android.architecture.blueprints.todomvp.mock");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_WAIT_PACKAGE, "com.example.android.architecture.blueprints.todomvp.mock");
        caps.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability(AndroidMobileCapabilityType.DISABLE_ANDROID_WATCHERS, true);
        caps.setCapability(AndroidMobileCapabilityType.IGNORE_UNIMPORTANT_VIEWS, true);

            return caps;
    }
}