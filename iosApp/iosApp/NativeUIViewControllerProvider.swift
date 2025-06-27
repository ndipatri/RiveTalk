import SwiftUI
import ComposeApp
import RiveRuntime


class NativeUIViewControllerProvider: UIViewControllerProvider {
    
    func provideCoffeeRobotAnimation() -> UIViewController {
        let riveView = RiveViewModel(fileName: "coffee_robot").view()
        
        // Ensure the SwiftUI view has a transparent background
        let fullScreenView = VStack {
            Spacer()
            riveView
                .frame(maxWidth: .infinity, maxHeight: .infinity)
            Spacer()
        }
            .background(Color.black)
        let hostingController = UIHostingController(rootView: fullScreenView)
        hostingController.view.backgroundColor = .black
        
        return hostingController
    }
}

