using UnityEngine;
using System.Collections;

public class PepperExample : MonoBehaviour {

	string subject = "Text from Unity!";

	// Use this for initialization
	void Start () {

	}

	// Update is called once per frame
	void Update () {

	}

	public void callPepperSay(){
		// Get the current activity so we can supply an Android Context instance to methods we call
		AndroidJavaClass unity = new AndroidJavaClass ("com.unity3d.player.UnityPlayer");
		AndroidJavaObject currentActivity = unity.GetStatic<AndroidJavaObject> ("currentActivity");

		// Get the Robot helper class
		AndroidJavaClass helper = new AndroidJavaClass ("name.nanek.pepperunityplugin.RobotHelper");

		// Call the say method passing it a context and a String with something to say
		helper.Call("say", currentActivity, subject);
	}
}